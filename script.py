import re
from collections import Counter

with open("compiler_errors.txt", "r", encoding="utf-8", errors="ignore") as f:
    lines = f.readlines()

print(f"Total lines in file: {len(lines)}")

# Look for javac summary lines like "X errors"
summary_lines = [l for l in lines if "error" in l.lower() and ("errors" in l.lower() or "error" in l.lower())]
print("Summary candidates:", summary_lines[-10:])
