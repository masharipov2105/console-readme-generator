package com.masharipov2105.systems.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;

public class InputValidatorTest{

	@BeforeEach
	public void setUp(){


	}

	@Test
	void testParseProjectName(){

		assertEquals("Console-app", InputValidator.parseProjectName("Console-app"));
		assertEquals(null, InputValidator.parseProjectName(null));
		assertEquals(null, InputValidator.parseProjectName(""));
	}

	@Test
	void testParseProjectDescription(){

		assertEquals("Description test", InputValidator.parseProjectDescription("Description test"));
		assertEquals(null, InputValidator.parseProjectDescription(null));
		assertEquals(null, InputValidator.parseProjectDescription(""));
	}

	@Test
	void testParseProjectFeatures(){

		ArrayList<String> res = new ArrayList<>();
		res.add("data1");
		res.add("data2");
		res.add("data3");
		assertEquals("data1", InputValidator.parseProjectFeatures(res).get(0));
		assertEquals("data2", InputValidator.parseProjectFeatures(res).get(1));
		assertEquals("data3", InputValidator.parseProjectFeatures(res).get(2));

		res.clear();
		assertEquals(null, InputValidator.parseProjectFeatures(null));
		assertEquals(null, InputValidator.parseProjectFeatures(res));
	}

	@Test
	void testParseProjectGoal(){

		assertEquals("Project goals", InputValidator.parseProjectGoal("Project goals"));
		assertEquals(null, InputValidator.parseProjectGoal(null));
		assertEquals(null, InputValidator.parseProjectGoal(""));
	}

	@Test
	void testParseTechnologies(){

		ArrayList<ArrayList<String>> res = new ArrayList<>();

		ArrayList<String> item = new ArrayList<>();
		item.add("| Java | 17+ | Asosiy dasturlash tili |");
		item.add("| Apache Maven | 3.9+ | Loyihani boshqarish |");
		item.add("| JUnit 5 | 5.9+ | Unit testlar |");

		res.add(item);

		assertEquals("| Java | 17+ | Asosiy dasturlash tili |", InputValidator.parseTechnologies(res).get(0).get(0));
		assertEquals("| Apache Maven | 3.9+ | Loyihani boshqarish |", InputValidator.parseTechnologies(res).get(0).get(1));
		assertEquals("| JUnit 5 | 5.9+ | Unit testlar |", InputValidator.parseTechnologies(res).get(0).get(2));

		res.clear();
		assertEquals(null, InputValidator.parseTechnologies(res));
	}

	@Test
	void testParseInstallWindowsCommands(){

		ArrayList<String> res = new ArrayList<>();

		res.add("data1");
		res.add("data2");
		res.add("data3");

		assertEquals("data1", InputValidator.parseInstallWindowsCommands(res).get(0));
		assertEquals("data2", InputValidator.parseInstallWindowsCommands(res).get(1));
		assertEquals("data3", InputValidator.parseInstallWindowsCommands(res).get(2));

		res.clear();
		assertEquals(null, InputValidator.parseInstallWindowsCommands(res));
	}

	@Test
	void testParseInstallLinuxMacCommands(){

		ArrayList<String> res = new ArrayList<>();

		res.add("data1");
		res.add("data2");
		res.add("data3");

		assertEquals("data1", InputValidator.parseInstallLinuxMacCommands(res).get(0));
		assertEquals("data2", InputValidator.parseInstallLinuxMacCommands(res).get(1));
		assertEquals("data3", InputValidator.parseInstallLinuxMacCommands(res).get(2));

		res.clear();
		assertEquals(null, InputValidator.parseInstallLinuxMacCommands(res));
	}

	@Test
	void testParseImagePaths(){

		ArrayList<String> paths = new ArrayList<>();
		paths.add("path1");
		paths.add("path2");

		assertEquals("path1", InputValidator.parseImagePaths(paths).get(0));
		assertEquals("path2", InputValidator.parseImagePaths(paths).get(1));

		paths.clear();

		assertEquals(null, InputValidator.parseImagePaths(paths));
	}

	@Test
	void testParseTreeData(){

		assertEquals("tree data", InputValidator.parseTreeData("tree data"));
		assertEquals(null, InputValidator.parseTreeData(null));
		assertEquals(null, InputValidator.parseTreeData(""));
	}

	@Test
	void testParseIitsenziya(){

		assertEquals("litsenziya text", InputValidator.parseIitsenziya("litsenziya text"));
		assertEquals(null, InputValidator.parseIitsenziya(null));
		assertEquals(null, InputValidator.parseIitsenziya(""));
	}

	@Test
	void testParseOwnerGithubName(){

		assertEquals("github username", InputValidator.parseOwnerGithubName("github username"));
		assertEquals(null, InputValidator.parseOwnerGithubName(null));
		assertEquals(null, InputValidator.parseOwnerGithubName(""));
	}

	@Test
	void testParseOwnerTelegramName(){

		assertEquals("@masharipov2105", InputValidator.parseOwnerTelegramName("@masharipov2105"));
		assertEquals(null, InputValidator.parseOwnerTelegramName(null));
		assertEquals(null, InputValidator.parseOwnerTelegramName(""));
		assertEquals("Invalid data: Telegram username", InputValidator.parseOwnerTelegramName("masharipov2105"));
	}

	@Test
	void testParseOwnerEmailName(){

		assertEquals("masharipov2105@gmail.com", InputValidator.parseOwnerEmailName("masharipov2105@gmail.com"));
		assertEquals(null, InputValidator.parseOwnerEmailName(null));
		assertEquals(null, InputValidator.parseOwnerEmailName(""));
		assertEquals("invalid data: Email account", InputValidator.parseOwnerEmailName("Hjsk"));
		assertEquals("invalid data: Invalid Gmail", InputValidator.parseOwnerEmailName("masharipov2105gmail.com"));
	}
}