package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.MacOsButton;
import AbstractFactory.checkboxes.CheckBox;
import AbstractFactory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacOsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacOSCheckbox();
	}
}
