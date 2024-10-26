package com.rtaylor02.adapters.api;

import com.rtaylor02.domain.Player;
import com.vtence.molecule.http.HttpStatus;
import io.undertow.util.StatusCodes;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class WordzEndpointTest {
    @Test
    void startGame() {
        HttpClient client = HttpClient.newHttpClient();
        var req =
        HttpResponse res = client.send(req, HttpResponse.BodyHandlers.discarding());
        assertThat(res).hasStatusCode(HttpStatus.NO_CONTENT.code);
    }

    private static final Player PLAYER = new Player("rodney123");
}
