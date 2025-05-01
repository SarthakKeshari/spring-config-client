//package com.example.greetingservice;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//// ConfigRefreshScheduler
//@Component
//public class PullBasedConfigScheduler {
//
//    private final WebClient webClient;
//
//    public PullBasedConfigScheduler(WebClient.Builder builder) {
//        this.webClient = builder.baseUrl("http://localhost:8080").build(); // adjust port if needed
//    }
//
//    @Scheduled(fixedRate = 15000)
//    public void refreshConfig() {
//        webClient.post()
//                .uri("/actuator/refresh")
//                .retrieve()
//                .bodyToMono(String.class)
//                .doOnNext(response -> System.out.println("Config refresh response: " + response))
//                .doOnError(error -> System.err.println("Failed to refresh config: " + error.getMessage()))
//                .subscribe();
//    }
//}
//
