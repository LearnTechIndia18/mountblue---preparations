import re

import sys

n = int(input().strip())
B = input().strip()
print(len(re.findall("010", B)))