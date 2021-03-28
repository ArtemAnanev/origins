package AbstractFactory;

import AbstractFactory.app.Application;
import AbstractFactory.factories.GUIFactory;
import AbstractFactory.factories.MacOsFactory;
import AbstractFactory.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
	/**
	 * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
	 * из конфигурации или окружения.
	 */
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOsFactory();
			app = new Application(factory);
		} else {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		return app;
	}

	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
}
