package com.tasf.prototipoQA.Especialista;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AgenteQA {
    
    String auditar(@MemoryId String idSesion, @UserMessage String peticion);
}