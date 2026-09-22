package com.masharipov2105.systems.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MarkdownTransmitterTest{


	//
	@Test
	void testprojectNameFormat(){

		assertEquals("# Console README Generator\n\n", MarkdownTransmitter.projectNameFormat("Console README Generator"));
        
	}

	//
	@Test
	void testprojectDescriptionFormat(){

		assertEquals("** Name ** - Decriptin\n\n---\n\n", MarkdownTransmitter.projectDescriptionFormat("Name%%Decriptin"));
	}        

	//
	@Test
	void testprojectFullDescriptionFormat(){

		String dd = "Name%%a%%b%%d";

		assertEquals("## About the project\n\n    Name\n\n- a\n- b\n- d\n\n---\n\n", MarkdownTransmitter.projectFullDescriptionFormat(dd));
	}

	//
	@Test
	void testprojectFeaturesFormat(){

		ArrayList<String> t = new ArrayList<>();

		t.add("a %% b");
		t.add("c %% d");

		assertEquals("## Features\n\n| Function | Description |\n|----------|-------------|\n| a | b |\n| c | d |\n\n---\n\n", MarkdownTransmitter.projectFeaturesFormat(t));
	}

	//
	@Test
	void projectGoalFormat(){

		String ddd = "Text%%ab%%bc%%cd";

		assertEquals("## Project objective\n\n    Text\n\n- ab\n- bc\n- cd\n\n---\n\n", MarkdownTransmitter.projectGoalFormat(ddd));
	}

	//
	@Test
	void testtechnologiesFormat(){

		ArrayList<ArrayList<String>> dd = new ArrayList<>();

		ArrayList<String> item1 = new ArrayList<>();
		ArrayList<String> item2 = new ArrayList<>();
		
		item1.add("abc");
		item1.add("bcd");
		item1.add("cde");

		item2.add("xyz");
		item2.add("yzw");
		item2.add("zwa");

		dd.add(item1);
		dd.add(item2);

		String result = "## Technologies\n\n" + 
		                "| Technology | Version | Objective |\n" +
		                "|------------|---------|-----------|\n" +
		                "| abc | bcd | cde |\n" +
		                "| xyz | yzw | zwa |\n" +
		                "\n---\n\n";
		assertEquals(result, MarkdownTransmitter.technologiesFormat(dd));
	}

	//
	@Test
	void testinstallWindowsCommandsFormat(){

		ArrayList<String> dd = new ArrayList<>();

		dd.add("ab");
		dd.add("bc");
		dd.add("cd");

        String result = "## Installation and Execution\n\n### Windows\n```cmd\n" +
                        " ab\n\n" +
                        " bc\n\n" +
                        " cd\n\n" +
                        "```\n---\n\n";

		assertEquals(result, MarkdownTransmitter.installWindowsCommandsFormat(dd));
	}

	//
	@Test
	void testinstallLinuxMacCommandsFormat(){

		ArrayList<String> dd = new ArrayList<>();

		dd.add("linux");
		dd.add("mac");
		dd.add("commands");

        	String result = "## Installation and Execution\n\n### Windows\n```cmd\n" +
                        " linux\n\n" +
                        " mac\n\n" +
                        " commands\n\n" +
                        "```\n---\n\n";

		assertEquals(result, MarkdownTransmitter.installLinuxMacCommandsFormat(dd));
	}

	//
	@Test
	void testimagePathsFormat(){

		ArrayList<String> imgs = new ArrayList<>();
		imgs.add("https://www.lorem.com/images/img1.png");
		imgs.add("https://www.lorem.com/images/img2.png");
		imgs.add("https://www.lorem.com/images/img3.png");

		String result = "## Project view\n\n" +
		                "![Home](https://www.lorem.com/images/img1.png)\n" +
		                "![Home](https://www.lorem.com/images/img2.png)\n" +
		                "![Home](https://www.lorem.com/images/img3.png)\n" +
		                "\n---\n\n";

		assertEquals(result, MarkdownTransmitter.imagePathsFormat(imgs));
	}

	//
	@Test
	void testtreeDataFormat(){

		assertEquals("## Project Structure\n\n```cmd\nTree\n```\n---\n\n", MarkdownTransmitter.treeDataFormat("Tree"));
	}

	//
	@Test
	void testlitsenziyaFormat(){

		assertEquals("## License\n\nLitsenziya text\n\n---\n\n", MarkdownTransmitter.litsenziyaFormat("Litsenziya text"));
	}

	//
	@Test
	void testownerFormat(){

		String[] connections = {"Github : masharipiv2105", "Telegram : @masharipiv2105", "Email : masharipiv2105@gmail.com"};

		String result = "## Author\n\n" +
		                "    Github : masharipiv2105\n\n" +
		                "    Telegram : @masharipiv2105\n\n" +
		                "    Email : masharipiv2105@gmail.com\n\n";

		assertEquals(result, MarkdownTransmitter.ownerFormat(connections));
	}
}