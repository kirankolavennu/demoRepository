package com.qa.test;

import org.testng.annotations.Test;


/***  
 
   
E:\workspaceK\DemoGitRepo>git checkout -b "Kiran_local"
Switched to a new branch 'Kiran_local'

E:\workspaceK\DemoGitRepo>git branch
* Kiran_local
  master

E:\workspaceK\DemoGitRepo>git status
On branch Kiran_local
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   pom.xml
        modified:   src/main/java/com/qa/lib/TestBase.java
        modified:   src/main/java/com/qa/pages/HomePage.java
        modified:   src/main/java/com/qa/pages/LoginPage.java
        modified:   src/main/java/com/qa/pages/SearchPage.java
        modified:   src/main/java/com/qa/util/TestUtil.java
        modified:   target/classes/com/qa/lib/TestBase.class
        modified:   target/classes/com/qa/pages/HomePage.class
        modified:   target/classes/com/qa/pages/LoginPage.class
        modified:   target/classes/com/qa/pages/SearchPage.class
        modified:   target/classes/com/qa/util/TestUtil.class

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .settings/org.testng.eclipse.maven.prefs
        src/main/java/com/qa/ExtentReport/
        target/classes/com/qa/ExtentReport/
        testng.xml

no changes added to commit (use "git add" and/or "git commit -a")

E:\workspaceK\DemoGitRepo>git add .

E:\workspaceK\DemoGitRepo>git commit -m "Adding the new files"
[Kiran_local e2b775f] Adding the new files
 15 files changed, 78 insertions(+), 9 deletions(-)
 create mode 100644 .settings/org.testng.eclipse.maven.prefs
 create mode 100644 src/main/java/com/qa/ExtentReport/ExtentReportListener.java
 create mode 100644 target/classes/com/qa/ExtentReport/ExtentReportListener.class
 rewrite target/classes/com/qa/lib/TestBase.class (64%)
 rewrite target/classes/com/qa/pages/HomePage.class (64%)
 rewrite target/classes/com/qa/pages/LoginPage.class (74%)
 rewrite target/classes/com/qa/pages/SearchPage.class (68%)
 rewrite target/classes/com/qa/util/TestUtil.class (64%)
 create mode 100644 testng.xml

E:\workspaceK\DemoGitRepo>git push origin Kiran_local
Enumerating objects: 63, done.
Counting objects: 100% (63/63), done.
Delta compression using up to 4 threads
Compressing objects: 100% (26/26), done.
Writing objects: 100% (35/35), 4.62 KiB | 278.00 KiB/s, done.
Total 35 (delta 8), reused 0 (delta 0)
remote: Resolving deltas: 100% (8/8), completed with 4 local objects.
remote:
remote: Create a pull request for 'Kiran_local' on GitHub by visiting:
remote:      https://github.com/kirankolavennu/demoRepository/pull/new/Kiran_local
remote:
To https://github.com/kirankolavennu/demoRepository.git
 * [new branch]      Kiran_local -> Kiran_local

E:\workspaceK\DemoGitRepo>git pull origin master
remote: Enumerating objects: 1, done.
remote: Counting objects: 100% (1/1), done.
remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (1/1), done.
From https://github.com/kirankolavennu/demoRepository
 * branch            master     -> FETCH_HEAD
   ca17257..a5d54ba  master     -> origin/master
Updating e2b775f..a5d54ba
Fast-forward

E:\workspaceK\DemoGitRepo>git status
On branch Kiran_local
nothing to commit, working tree clean

E:\workspaceK\DemoGitRepo>git branch
* Kiran_local
  master    
 *  ***/

public class LoginTest {

	@Test
	public void testlogin() {
		System.out.println("Login test ");
	}
}
