package refactoring_guru.factory_method;

/**
 * Общий интерфейс для всех продуктов.
 */
interface Button {
    void render();
    void onClick();
}

/**
 * Реализация HTML кнопок.
 */
class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - Hello World");
    }
}

/**
 * Реализация нативных кнопок операционной системы.
 */
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("<windows-button>Test button</windows-button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Windows button says - Hello world");
    }
}


/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
abstract class Dialog {
    public void renderWindow() {
        // ... остальной код диалога ...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract Button createButton();
}

/**
 * HTML-диалог.
 */
class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

/**
 * Диалог на элементах операционной системы.
 */
class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}