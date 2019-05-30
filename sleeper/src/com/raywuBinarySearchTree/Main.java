package com.raywuBinarySearchTree;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.stream.Collectors.toList;
public class Main {

     public static void main(String[] args) throws InterruptedException {
            WaitingRoom Room = new WaitingRoom(5);

            ExecutorService executorService = Executors.newFixedThreadPool(100);
            executorService.submit(new Barber(Room));
            executorService.submit(new Barber(Room));
            executorService.submit(new Barber(Room));

            List<Customer> customers = Stream.generate(() -> new Customer(Room))
                    .limit(50)
                    .peek(executorService::submit)
                    .collect(toList());

            while (!customers.stream().allMatch(Customer::isShaved)) {
                TimeUnit.SECONDS.sleep(1);
            }

            System.out.println("all customers have been shaved");
            executorService.shutdownNow();
            executorService.awaitTermination(1, MINUTES);
        }

    }