public class Main {
    public static void main(String...args){
        WorldState worldState = new WorldState();

        boolean isworldnegativelygood = worldState.isWorldNegativelyGood();
        System.out.println("Plohoje li v mire sostojanije ? " + isworldnegativelygood + "  Ne vsjo tak ploho :)");

        boolean isworldpositivelygood = worldState.isWorldPositivelyGood();
        System.out.println("Horoshee li v mire sostojanije? " + isworldpositivelygood + " No estj svoi minusi");

    }


}
