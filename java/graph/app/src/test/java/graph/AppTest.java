/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
@Test void addNodeTest(){

  Graph graph = new Graph();

  graph.addNode("10");
  assertEquals("[10]", graph.getNodes().toString());


}
  @Test void addedgeTest(){

    Graph graph = new Graph();

    graph.addNode("10");
    graph.addNode("1");

    graph.addEdge("10", "1");

    assertEquals("[1, 10]",graph.getNodes().toString());
    assertEquals(2, graph.size());
  }
  @Test
  public void emptyGraph(){

    Graph graph = new Graph();
    assertEquals(0,graph.size());

  }

  @Test
  public void breadth_First(){
    Graph graph = new Graph();
    graph.addNode("10");
    graph.addNode("5");
    graph.addNode("1");
    graph.addNode("4");
    graph.addNode("7");
    graph.addNode("6");

    graph.addEdge("10" , "1");
    graph.addEdge("1" , "5");
    graph.addEdge("7" , "10");
    graph.addEdge("4" , "5");
    graph.addEdge("4" , "6");
    graph.addEdge("7" , "6");

    assertEquals("[5, 1, 4, 10, 6, 7]",graph.breadthFirst("5").toString());

  }

}
