import java.util.Arrays;
import java.util.List;

public class StartegyPatternOldWay {

  public static void main(String[] args) {

    List<Strategy> strategies = 
        Arrays.asList(
          new LazyStratgey(), 
          new ActiveStratgey()
        );
                      
    for(Strategy stg : strategies){
      stg.performTask();
    }
  }
}