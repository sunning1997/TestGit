package Test01;

import org.junit.Test;

import Git01.HelloGit;

public class GitTest {
	
	@Test
	public void test() {
		HelloGit git = new HelloGit();
		git.HelloGit("Git Test!");
	}
}
