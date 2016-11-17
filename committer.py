import os
import platform
import subprocess
from datetime import datetime
from datetime import date
from datetime import timedelta
import random

def calling(git_date=datetime(2016,11,14,19,53,41)):
    changes = ["LeetCode #10"]
    element = random.choice(changes)
    #subprocess.call("")
    #subprocess.call("git --version")
    #subprocess.call("git status")
    print(platform.system())
    subprocess.Popen(['git', 'add', 'src/leetcode/solutions/InsertIntervals.java'], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    os.environ["GIT_COMMITTER_DATE"] = str(git_date)
    os.environ["GIT_AUTHOR_DATE"] = str(git_date)
    subprocess.Popen(['git', 'commit', '-am', '\"' + str(element) + '\"', '--date=' + str(git_date)], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    subprocess.Popen(['git', 'push', 'origin', 'master'],stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    print(os.environ["GIT_COMMITTER_DATE"])
    print(os.environ["GIT_AUTHOR_DATE"])
    del os.environ["GIT_COMMITTER_DATE"]
    del os.environ["GIT_AUTHOR_DATE"]
    print("Calling")

def main():
    calling()

if __name__ == "__main__":
    main()