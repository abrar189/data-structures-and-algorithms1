/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

      Graph graph = new Graph();
      graph.addNode("10");
      graph.addNode("5");
      graph.addNode("1");
      graph.addNode("4");
      graph.addNode("7");
      graph.addNode("6");

      graph.addEdge("10" , "1",150);
      graph.addEdge("1" , "5",120);
      graph.addEdge("7" , "10",160);
      graph.addEdge("4" , "5",200);
      graph.addEdge("4" , "6",170);
      graph.addEdge("7" , "6",90);

      String[] trip = {"10" , "1" , "5"};
      String[] trip2 = {"4" , "5"};
      String[] trip3 = {"6" , "1" , "5" , "7" , "5"  };
      String[] trip4 = {"6" , "7" , "10" , "1" , "5"  };

//      System.out.println(graph.businessTrip("10",trip));
//      System.out.println(graph.businessTrip("4",trip2));
//      System.out.println(graph.businessTrip("6",trip3));
//      System.out.println(graph.businessTrip("6",trip4));
//      System.out.println(graph);
//      System.out.println(graph.getNodes());
//      System.out.println(graph.getNeighbors("10"));
//      System.out.println(graph.getNeighbors("7"));
//      System.out.println(graph.getNeighbors("1"));
//      System.out.println(graph.size());

//      System.out.println(graph.breadthFirst("5"));
//      System.out.println(graph.breadthFirst("7"));
//      System.out.println(graph.breadthFirst("10"));

      System.out.println(graph.depthFirst("5"));
      System.out.println(graph.depthFirst("7"));
      System.out.println(graph.depthFirst("10"));

    }
}
