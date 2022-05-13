package edu.qc.seclass;

public class BuggyClass {

    public int buggyMethod1(int x, int y){
        if(x > 0){
            return (y/x);
        }
        return (x/y);
    }

    public int buggyMethod2(int x, int y){
        if (y!=0){
            y= (y*y);
        }
        return x/y;
    }

    public int buggyMethod3(int x, int y){
        if (x < 0){
            x = (x / 2);
        }
        return(x/y);
    }

    public void buggyMethod4(){
       //Branch coverage is stronger than statement coverage and may reveal errors that statement coverage would not reveal
        // so a method that achieves 100% statement coverage and reveals fault as well as 100% branch coverage and without revealing faults
        // would not be possible
    }

    public void buggyMethod5(int i){
        //int x;
        //[point where you can add code]
        //x = i/0;
        // [point where you can add code]
        //it would not be possible to achieve 100% statement coverage without revealing fault because that would entail
        //executing every statement and if we executed x = i/0, we'd always run into the divide by zero fault
    }
}
