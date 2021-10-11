package challengs;



public class Pseudo {

  private  String value;
  public Stack stack1=new Stack();
  public Stack stack2=new Stack();

  public Pseudo(String value) {
  this.value=value;
  }

  public Pseudo() {

  }

  public void enqueue(String value){
    while (stack1.isEmpty() ){
      stack2.push(stack1.pop());

    }
    stack1.push(value);

    while (stack2.isEmpty()){
      stack1.push(stack2.pop());

    }
  }

  public String dequeue(){
    if (stack1.isEmpty()){
      throw new IllegalArgumentException("Empty");
    }
    String string = stack1.peek();
    stack1.pop();
    return string;
  }

  @Override
  public String toString() {
    return "PseudoQueue{" +
      "stack1=" + stack1 +
      ", stack2=" + stack2 +
      '}';
  }





}
