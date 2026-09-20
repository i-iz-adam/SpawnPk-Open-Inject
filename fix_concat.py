import os
import re

pattern = re.compile(r'StringConcatFactory\.makeConcatWithConstants<[^>]+>\((.*?)\)')

updated_files = 0
for root, dirs, files in os.walk('src/main/java/rs'):
    for f in files:
        if f.endswith('.java'):
            fp = os.path.join(root, f)
            with open(fp, encoding='utf-8', errors='replace') as file:
                content = file.read()
            if 'makeConcatWithConstants' in content:
                new_content = pattern.sub(r'String.valueOf(\1)', content)
                if new_content != content:
                    with open(fp, 'w', encoding='utf-8') as file:
                        file.write(new_content)
                    updated_files += 1

print(f'Updated {updated_files} files with StringConcatFactory fix!')
