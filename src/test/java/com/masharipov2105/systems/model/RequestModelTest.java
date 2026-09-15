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

	@Test
	void testGetProjectName(){

		assertEquals("Console-app", model.getProjectName());
	}

	@Test
	void testGetProjectDescription(){

		assertEquals("This is console-app", model.getProjectDescription());
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


}