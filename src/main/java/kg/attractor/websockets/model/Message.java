package kg.attractor.websockets.model;

import kg.attractor.websockets.enums.Action;

import java.time.Instant;

public record Message(User user, String receiverId, String comment, Action action, Instant timestamp) {

}
