package AbstractFactory.checkboxes;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под Windows.
 */
public class WindowsCheckbox implements CheckBox{
	@Override
	public void paint() {
		System.out.println("You have created WindowsCheckbox.");
	}
}
