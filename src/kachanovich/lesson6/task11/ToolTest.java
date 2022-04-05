package kachanovich.lesson6.task11;

public class ToolTest {
    public static void main(String[] args) {
        Tool tool1 = new Drum(30);
        Tool tool2 = new Pipe(10);
        Tool tool3 = new Guitar(12);
        Tool[] tools = {tool1, tool2, tool3};
        for (int i = 0; i < tools.length; i++) {
            tools[i].play();
        }
    }
}
