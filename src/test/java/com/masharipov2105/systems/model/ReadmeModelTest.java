package com.masharipov2105.systems.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class ReadmeModelTest{

	//initialize variables
	private ReadmeModel finalModel = null;

	@BeforeEach
	public void setUp(){

		finalModel = new ReadmeModel(

			"line1",
			"line2",
			"line3",
			"line4",
			"line5",
			"line6",
			"line7",
			"line8",
			"line9",
			"line10",
			"line11",
			"line12",
			"line13",
			"line14"
		);

	}

	@Test
	void testCreatReadmeModelSuccess(){

		assertEquals(true, finalModel != null);
	}



	//================================= getter methods testing ===========================================
	@Test
	void testGetFinalProjectName(){

		assertEquals("line1", finalModel.getFinalProjectName());
	}

	@Test
	void testGetFinalProjectDescription(){

		assertEquals("line2", finalModel.getFinalProjectDescription());
	}

	@Test
	void testGetFinalProjectFullDescription(){

		assertEquals("line3",finalModel.getFinalProjectFullDescription());
	}

	@Test
	void testGetFinalProjectFeatures(){

		assertEquals("line4",finalModel.getFinalProjectFeatures());
	}

	@Test
	void testGetFinalProjectGoal(){

		assertEquals("line5", finalModel.getFinalProjectGoal());
	}

	@Test
	void testGetFinalTechnologies(){

		assertEquals("line6", finalModel.getFinalTechnologies());
	}

	@Test
	void testGetFinalInstallWindowsCommands(){

		assertEquals("line7", finalModel.getFinalInstallWindowsCommands());
	}

	@Test
	void testGetFinalInstallLinuxMacCommands(){

		assertEquals("line8", finalModel.getFinalInstallLinuxMacCommands());
	}

	@Test
	void testGetFinalImagePaths(){

		assertEquals("line9", finalModel.getFinalImagePaths());
	}

	@Test
	void testGetFinalTreeData(){

		assertEquals("line10", finalModel.getFinalTreeData());
	}

	@Test
	void testGetFinalLitsenziya(){

		assertEquals("line11", finalModel.getFinalLitsenziya());
	}

	@Test
	void testGetFinalOwnerGithubName(){

		assertEquals("line12", finalModel.getFinalOwnerGithubName());
	}

	@Test
	void testGetFinalOwnerTelegramName(){

		assertEquals("line13", finalModel.getFinalOwnerTelegramName());
	}

	@Test
	void testGetFinalOwnerEmailName(){

		assertEquals("line14", finalModel.getFinalOwnerEmailName());
	}




	//================================= setter methods testing ===========================================

	@Test
	void testSetFinalProjectName(){

		finalModel.setFinalProjectName("new line1");
		assertEquals("new line1", finalModel.getFinalProjectName());
	}

	@Test
	void testSetFinalProjectDescription(){

		finalModel.setFinalProjectDescription("new line2");
		assertEquals("new line2", finalModel.getFinalProjectDescription());
	}

	@Test
	void testSetFinalProjectFullDescription(){

		finalModel.setFinalProjectFullDescription("new line3");
		assertEquals("new line3", finalModel.getFinalProjectFullDescription());
	}

	@Test
	void testSetFinalProjectFeatures(){

		finalModel.setFinalProjectFeatures("new line4");
		assertEquals("new line4", finalModel.getFinalProjectFeatures());
	}

	@Test
	void testSetFinalProjectGoal(){

		finalModel.setFinalProjectGoal("new line5");
		assertEquals("new line5", finalModel.getFinalProjectGoal());
	}

	@Test
	void testSetFinalTechnologies(){

		finalModel.setFinalTechnologies("new line6");
		assertEquals("new line6", finalModel.getFinalTechnologies());
	}

	@Test
	void testSetFinalInstallWindowsCommands(){

		finalModel.setFinalInstallWindowsCommands("new line7");
		assertEquals("new line7", finalModel.getFinalInstallWindowsCommands());
	}

	@Test
	void testSetFinalInstallLinuxMacCommands(){

		finalModel.setFinalInstallLinuxMacCommands("new line8");
		assertEquals("new line8", finalModel.getFinalInstallLinuxMacCommands());
	}

	@Test
	void testSetFinalImagePaths(){

		finalModel.setFinalImagePaths("new line9");
		assertEquals("new line9", finalModel.getFinalImagePaths());
	}

	@Test
	void testSetFinalTreeData(){

		finalModel.setFinalTreeData("new line10");
		assertEquals("new line10", finalModel.getFinalTreeData());
	}

	@Test
	void testSetFinalLitsenziya(){

		finalModel.setFinalLitsenziya("new line11");
		assertEquals("new line11", finalModel.getFinalLitsenziya());
	}

	@Test
	void testSetFinalOwnerGithubName(){

		finalModel.setFinalOwnerGithubName("new line12");
		assertEquals("new line12", finalModel.getFinalOwnerGithubName());
	}

	@Test
	void testSetFinalOwnerTelegramName(){

		finalModel.setFinalOwnerTelegramName("new line13");
		assertEquals("new line13", finalModel.getFinalOwnerTelegramName());
	}

	@Test
	void testSetFinalOwnerEmailName(){

		finalModel.setFinalOwnerEmailName("new line14");
		assertEquals("new line14", finalModel.getFinalOwnerEmailName());
	}
}