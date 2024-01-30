package org.example;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public final class Main {

    public static void main(String[] args) {

        OpenAiService service = new OpenAiService("sua-chave-de-autorização");
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt("Olá")
                .model("babbage-002")
                        .echo(true)
                        .build();
        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);


    }
}
