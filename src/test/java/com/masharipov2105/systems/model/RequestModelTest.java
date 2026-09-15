package com.masharipov2105.systems.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;

public class RequestModelTest{


	private RequestModel model = null;

	@BeforeEach
	public void setUp(){

		ArrayList<String> features = new ArrayList<>();
		features.add("app-features");

		ArrayList<ArrayList<String>> tecno = new ArrayList<>();
		
		ArrayList<String> tecno_items = new ArrayList<>();
		tecno_items.add("| Java | 17+ | Asosiy dasturlash tili |");

		tecno.add(tecno_items);

		ArrayList<String> windows_config = new ArrayList<>();
		windows_config.add("git clone https://github.com/masharipov2105/console-readme-generator.git");
		windows_config.add("cd console-readme-generator");
		windows_config.add("java -jar target/readme-generator-1.0.jar");

		ArrayList<String> linuxmac_config = new ArrayList<>();
		linuxmac_config.add("git clone https://github.com/masharipov2105/console-readme-generator.git");
		linuxmac_config.add("cd console-readme-generator");
		linuxmac_config.add("java -jar target/readme-generator-1.0.jar");

		ArrayList<String> imagePaths = new ArrayList<>();
		imagePaths.add("https://fastly.picsum.photos/id/571/536/354.jpg?hmac=FIt_jMj_iduMvU7x2Ho6tYZQTk3j_mIZDqHrF6w_5X0");
		imagePaths.add("https://fastly.picsum.photos/id/571/536/354.jpg?hmac=FIt_jMj_iduMvU7x2Ho6tYZQTk3j_mIZDqHrF6w_5X");

		model = new RequestModel(

			"Console-app",
			"This is console-app",
			"This is a full description",
			features,
			"project-goals",
			tecno,
			windows_config,
			linuxmac_config,
			imagePaths,
			"app-tree-data",
			"app-litsenziya",
			"masharipov2105",
			"masharipov2105",
			"masharipov2105"
		);
	}

	@Test
	void testCreateModelSuccess(){

		assertEquals(true, model != null);
	}


	//============================== getter methods test =========================================

	@Test
	void testGetProjectName(){

		assertEquals("Console-app", model.getProjectName());
	}

	@Test
	void testGetProjectDescription(){

		assertEquals("This is console-app", model.getProjectDescription());
	}

	@Test
	void testGetProjectFullDescription(){

		assertEquals("This is a full description", model.getProjectFullDescription());
	}

	@Test
	void testGetProjectFeatures(){

		ArrayList<String> features = new ArrayList<>();
		features.add("app-features");

		assertEquals(features, model.getProjectFeatures());
	}

	@Test
	void testGetProjectGoal(){

		assertEquals("project-goals", model.getProjectGoal());
	}

	@Test
	void testGetTechnologies(){

		ArrayList<ArrayList<String>> tecno = new ArrayList<>();
		
		ArrayList<String> tecno_items = new ArrayList<>();
		tecno_items.add("| Java | 17+ | Asosiy dasturlash tili |");

		tecno.add(tecno_items);

		assertEquals(tecno, model.getTechnologies());
	}

	@Test
	void testGetInstallWindowsCommands(){

		ArrayList<String> windows_config = new ArrayList<>();
		windows_config.add("git clone https://github.com/masharipov2105/console-readme-generator.git");
		windows_config.add("cd console-readme-generator");
		windows_config.add("java -jar target/readme-generator-1.0.jar");

		assertEquals(windows_config, model.getInstallWindowsCommands());
	}

	@Test
	void testGetInstallLinuxMacCommands(){

		ArrayList<String> linuxmac_config = new ArrayList<>();
		linuxmac_config.add("git clone https://github.com/masharipov2105/console-readme-generator.git");
		linuxmac_config.add("cd console-readme-generator");
		linuxmac_config.add("java -jar target/readme-generator-1.0.jar");

		assertEquals(linuxmac_config, model.getInstallLinuxMacCommands());
	}

	@Test
	void testGetImagePaths(){

		ArrayList<String> imagePaths = new ArrayList<>();
		imagePaths.add("https://fastly.picsum.photos/id/571/536/354.jpg?hmac=FIt_jMj_iduMvU7x2Ho6tYZQTk3j_mIZDqHrF6w_5X0");
		imagePaths.add("https://fastly.picsum.photos/id/571/536/354.jpg?hmac=FIt_jMj_iduMvU7x2Ho6tYZQTk3j_mIZDqHrF6w_5X");

		assertEquals(imagePaths, model.getImagePaths());
	}

	@Test
	void testGetTreeData(){

		assertEquals("app-tree-data", model.getTreeData());
	}

	@Test
	void testGetLitsenziya(){

		assertEquals("app-litsenziya", model.getLitsenziya());
	}

	@Test
	void testGetOwnerGithubName(){

		assertEquals("masharipov2105", model.getOwnerGithubName());
	}

	@Test
	void testGetOwnerTelegramName(){

		assertEquals("masharipov2105", model.getOwnerTelegramName());
	}

	@Test
	void testGetOwnerEmailName(){

		assertEquals("masharipov2105", model.getOwnerEmailName());
	}



	//============================== setter methods test =========================================

	@Test
	void testSetProjectName(){

		model.setProjectName("new-Console-app-name");
		assertEquals("new-Console-app-name", model.getProjectName());
	}

	@Test
	void testSetProjectDescription(){

		model.setProjectDescription("new project decription text");
		assertEquals("new project decription text", model.getProjectDescription());
	}

	@Test
	void testSetProjectFullDescription(){

		model.setProjectFullDescription("This is a new full description");
		assertEquals("This is a new full description", model.getProjectFullDescription());
	}

	@Test
	void testSetProjectFeatures(){

		ArrayList<String> new_features = new ArrayList<>();
		new_features.add("app-features");

		model.setProjectFeatures(new_features);

		assertEquals(new_features, model.getProjectFeatures());
	}

	@Test
	void testSetProjectGoal(){

		model.setProjectGoal("new-project-goals");
		assertEquals("new-project-goals", model.getProjectGoal());
	}

	@Test
	void testSetTechnologies(){

		ArrayList<ArrayList<String>> new_tecno = new ArrayList<>();
		
		ArrayList<String> tecno_items = new ArrayList<>();
		tecno_items.add("| Java | 17 | Asosiy dasturlash tili |");

		new_tecno.add(tecno_items);

		model.setTechnologies(new_tecno);

		assertEquals(new_tecno, model.getTechnologies());
	}

	@Test
	void testSetInstallWindowsCommands(){

		ArrayList<String> new_windows_config = new ArrayList<>();
		new_windows_config.add("git clone https://github.com/masharipov2105/console-readme-generator.git");
		new_windows_config.add("cd console-readme-generator");
		new_windows_config.add("java -jar target/readme-generator-1.1.jar");

		model.setInstallWindowsCommands(new_windows_config);

		assertEquals(new_windows_config, model.getInstallWindowsCommands());
	}

	@Test
	void testSetInstallLinuxMacCommands(){

		ArrayList<String> new_linuxmac_config = new ArrayList<>();
		new_linuxmac_config.add("git clone https://github.com/masharipov2105/console-readme-generator.git");
		new_linuxmac_config.add("cd console-readme-generator");
		new_linuxmac_config.add("java -jar target/readme-generator-1.1.jar");

		model.setInstallLinuxMacCommands(new_linuxmac_config);

		assertEquals(new_linuxmac_config, model.getInstallLinuxMacCommands());
	}

	@Test
	void testSetImagePaths(){

		ArrayList<String> newImagePaths = new ArrayList<>();
		newImagePaths.add("https://github.com/masharipov2105/images1.png");
		newImagePaths.add("https://github.com/masharipov2105/images2.png");

		model.setImagePaths(newImagePaths);

		assertEquals(newImagePaths, model.getImagePaths());
	}

	@Test
	void testSetTreeData(){

		model.setTreeData("new-app-tree-data");
		assertEquals("new-app-tree-data", model.getTreeData());
	}

	@Test
	void testSetLitsenziya(){

		model.setLitsenziya("new-app-litsenziya");		
		assertEquals("new-app-litsenziya", model.getLitsenziya());
	}

	@Test
	void testSetOwnerGithubName(){

		model.setOwnerGithubName("rudy");
		assertEquals("rudy", model.getOwnerGithubName());
	}

	@Test
	void testSetOwnerTelegramName(){

		model.setOwnerTelegramName("rudy");
		assertEquals("rudy", model.getOwnerTelegramName());
	}

	@Test
	void testSetOwnerEmailName(){

		model.setOwnerEmailName("rudy");
		assertEquals("rudy", model.getOwnerEmailName());
	}
}