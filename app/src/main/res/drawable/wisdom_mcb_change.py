'''

import os
for filename in os.listdir("."):
	os.rename(filename, filename.replace("-", "_")
'''
import os
for filename in os.listdir("."):
	os.rename(filename, "wisdom_"+filename)
