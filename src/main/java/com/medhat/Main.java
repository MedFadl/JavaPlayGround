package com.medhat;
import com.medhat.ExcutiveFramework.ExecutorsDemo;
import com.medhat.concurrency.DownloadTaskFile;
import com.medhat.generics.Listo;
import com.medhat.stream.Movie;
import java.util.stream.Stream;
import static com.medhat.concurrency.ThreadDemo.showThread;




public class Main {
    public static void main(String[] args) {
        //var s = Stream.generate(()-> (int) (Math.random() * 100));
        //s.limit(10).forEach(System.out::println);
        //Stream.iterate(1,n -> n + 1).limit(10).forEach(System.out::println);
        //new Movie();
        //showThread();
        ExecutorsDemo.show();
    }
}