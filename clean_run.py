import subprocess

subprocess.run(['python', 'run_full_remapping.py'])
subprocess.run(['python', 'fix_ca.py'])
subprocess.run(['python', 'fix_last_file.py'])
