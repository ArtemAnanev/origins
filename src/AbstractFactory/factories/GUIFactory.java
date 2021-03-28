package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.CheckBox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
	Button createButton();
	CheckBox createCheckBox();
}
