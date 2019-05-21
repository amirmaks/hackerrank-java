package refactoring_guru.decorator;

/**
 * Базовый интерфейс Компонента определяет поведение, которое изменяется
 * декораторами.
 */
interface Component {
    public String operation();
}

/**
 * Конкретные Компоненты предоставляют реализации поведения по умолчанию. Может
 * быть несколько вариаций этих классов.
 */
class ConcreteComponent implements Component {
    @Override
    public String operation() {
        return "Concrete Component";
    }
}

/**
 * Базовый класс Декоратора следует тому же интерфейсу, что и другие компоненты.
 * Основная цель этого класса - определить интерфейс обёртки для всех конкретных
 * декораторов. Реализация кода обёртки по умолчанию может включать в себя поле
 * для хранения завёрнутого компонента и средства его инициализации.
 */
class Decorator implements Component {
    protected Component component;
    Decorator(Component component) {
        this.component = component;
    }
    @Override
    public String operation() {
        return this.component.operation();
    }
}

/**
 * Конкретные Декораторы вызывают обёрнутый объект и изменяют его результат
 * некоторым образом.
 */
class ConcreteDecoratorA extends Decorator {
    ConcreteDecoratorA(Component component) {
        super(component);
    }
    /**
     * Декораторы могут вызывать родительскую реализацию операции, вместо того,
     * чтобы вызвать обёрнутый объект напрямую. Такой подход упрощает расширение
     * классов декораторов.
     */
    public String operation() {
        return "ConcreteDecoratorA (" + super.operation()  + ")";
    }
}

/**
 * Декораторы могут выполнять своё поведение до или после вызова обёрнутого
 * объекта.
 */
class ConcreteDecoratorB extends Decorator {
    ConcreteDecoratorB(Component component) {
        super(component);
    }

    public String operation() {
        return "ConcreteDecoratorB (" + super.operation()  + ")";
    }
}

public class Demo {
    private static void clientCode(Component component) {
        System.out.println("RESULT: " + component.operation());
    }

    public static void main(String[] args) {
        /**
         * Таким образом, клиентский код может поддерживать как простые компоненты...
         */
        Component simple = new ConcreteComponent();
        System.out.println("Client: I've got a simple component: \n");
        clientCode(simple);
        System.out.println("\n\n");


        /**
         * ...так и декорированные.
         *
         * Обратите внимание, что декораторы могут обёртывать не только простые
         * компоненты, но и другие декораторы.
         */

        Decorator decorator1 = new ConcreteDecoratorA(simple);
        Decorator decorator2 = new ConcreteDecoratorB(decorator1);
        System.out.println("Client I've got a decorated component: \n");
        clientCode(decorator2);

    }
}
