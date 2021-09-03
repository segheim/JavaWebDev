package com.epam.jwd.task3.composite;

public class AppText {
    public static void main(String[] args) {
        CompositeText text = new CompositeText();

        CompositeText parag = new CompositeText();

        CompositeText litter = new CompositeText();

        Component p1 = new CompositeParagraph();
        Component p2 = new CompositeParagraph();

        Component l1 = new Litter();
        Component l2 = new Litter();
        Component l3 = new Litter();
        Component l4 = new Litter();

        text.addComponent(p1);
        text.addComponent(p2);

        p1.addComponent(l1);
        p1.addComponent(l2);
        p1.addComponent(l3);

        p2.addComponent(l4);
        text.print();

        parag.addComponent(p1);

        litter.addComponent(l1);
        litter.addComponent(l2);

        parag.addComponent(litter);
        parag.print();


    }
}
