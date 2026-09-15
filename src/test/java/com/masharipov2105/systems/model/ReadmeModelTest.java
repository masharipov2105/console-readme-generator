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

			"# console-readme-generator",
			"**console-readme-generator** — bu sizga professional README.md fayllarini avtomatik yaratib beruvchi konsol ilovasi. Sizga 10 ta savol beradi va javoblaringiz asosida GitHub’ga mos README yaratadi.",
			"---## 📖 Loyiha haqida \nUshbu loyiha **Maven** va **Layered Architecture** asosida qurilgan bo‘lib, quyidagi imkoniyatlarni taqdim etadi: \n- 🔹 Interaktiv savol-javob orqali README yaratish\n- 🔹 3 ta operatsion tizim uchun (Windows, Linux, macOS) alohida ko‘rsatmalar\n- 🔹 Markdown formatida chiroyli va tushunarli natija",
			"---## 🎯 Maqsad\nLoyiha quyidagi maqsadlarda yaratilgan:\n- 🧠 Maven va Layered Architecture bo‘yicha amaliy ko‘nikmalarni mustahkamlash\n- ⏱️ Har bir loyiha uchun README yozish vaqtini qisqartirish\n- 📚 O‘z portfolio loyihalarini professional ko‘rinishga keltirish",
			"---\n## ✨ Xususiyatlar\n| Funksiya | Tavsif |\n|----------|--------|\n| Interaktiv muloqot | 10 ta savol orqali README yaratish |\n| 3 ta OS uchun qo‘llanma | Windows, Linux va macOS uchun alohida ko‘rsatmalar |\n| Copy button tayyor | Terminal buyruqlari maxsus kod bloklarida aks etadi |\n| Markdown asosida | GitHub va boshqa platformalarda chiroyli ko‘rinadi |",
			"---## 🛠️ Texnologiyalar\n| Texnologiya | Versiya | Maqsad |\n|-------------|---------|--------|\n| Java | 17+ | Asosiy dasturlash tili |\n| Apache Maven | 3.9+ | Loyihani boshqarish |\n| JUnit 5 | 5.9+ | Unit testlar |",
			"---## ⚙️ O‘rnatish va Ishga Tushirish\n### Windows\n```cmd\ngit clone https://github.com/masharipov2105/console-readme-generator.git\ncd console-readme-generator\nmvn clean package\njava -jar target/readme-generator-1.0.jar\n```",
			"### Linux / macOS\n```cmd\ngit clone https://github.com/masharipov2105/console-readme-generator.git\ncd console-readme-generator\nmvn clean package\njava -jar target/readme-generator-1.0.jar```",
			"## 📸 Loyiha ko‘rinishi\n**Ishga tushirish jarayonidan namunalar:**\n![Home](https://fastly.picsum.photos/id/571/536/354.jpg?hmac=FIt_jMj_iduMvU7x2Ho6tYZQTk3j_mIZDqHrF6w_5X0)",
			"## 📁 Loyiha Tuzilishi\n```cmd\nconsole-readme-generator/\n├── src/\n│   ├── main/\n│   │   └── java/com/masharipov2105/readme/\n│   │       ├── Main.java\n│   │       ├── App.java\n│   │       ├── model/\n│   │       │   └── ProjectInfo.java\n│   │       ├── service/\n│   │       │   ├── QuestionService.java\n│   │       │   └── ReadmeGenerator.java\n│   │       └── util/\n│   │           └── FileWriterUtil.java\n│   └── test/\n│       └── java/.../service/\n│           └── ReadmeGeneratorTest.java\n├── templates/\n│   └── default-template.md\n├── pom.xml\n└── README.md```",
			"## Litsenziya\nUshbu loyiha MIT litsenziyasi asosida tarqatiladi.",
			"## 👤 Muallif\n\tGitHub: @masharipov2105",
			"\tTelegram: @masharipov2105",
			"\tEmail: masharipov2105@gmail.com"
		);

		assertEquals(true, finalModel != null);
	}
}