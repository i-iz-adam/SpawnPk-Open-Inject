import os

failed = []
for root, dirs, files in os.walk('temp_vf_src'):
    for f in files:
        if f.endswith('.java'):
            fp = os.path.join(root, f)
            with open(fp, encoding='utf-8', errors='replace') as file:
                content = file.read()
                if "Couldn't be decompiled" in content or len(content.strip()) < 50:
                    failed.append(fp)

print(f'Total Vineflower failed files: {len(failed)}')
for f in failed:
    print(' ', f)
