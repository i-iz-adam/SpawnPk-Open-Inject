import os
import subprocess
import sys

java_bin = r"C:\Users\naxos\.jdks\corretto-21.0.10\bin\javac.exe"
classpath = "libs/client-obfuscated-deps.jar"

files = []
for root, dirs, f_list in os.walk('src/main/java'):
    for f in f_list:
        if f.endswith('.java'):
            files.append(os.path.join(root, f))

os.makedirs('build/test_classes', exist_ok=True)

def test_files(file_list):
    with open('args.txt', 'w', encoding='utf-8') as f:
        f.write('-cp libs/client-obfuscated-deps.jar -d build/test_classes\n')
        for fl in file_list:
            f.write(fl.replace('\\', '/') + '\n')
    res = subprocess.run([java_bin, '@args.txt'], capture_output=True, text=True)
    return 'AssertionError' in res.stderr, res.stderr

has_assert, stderr = test_files(files)
print('Testing all files together. Has AssertionError:', has_assert)
print('Compilation Output:\n', stderr[:2000])
