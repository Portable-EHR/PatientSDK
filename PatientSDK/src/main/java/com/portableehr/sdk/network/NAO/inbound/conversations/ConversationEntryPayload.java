package com.portableehr.sdk.network.NAO.inbound.conversations;

import com.portableehr.patient.ui.user.conversations.ConversationEntryConsentStatus;
import com.portableehr.patient.ui.user.conversations.ConversationEntryPayloadType;

import java.util.List;

public class ConversationEntryPayload {
    private String text;
    private String fromLocation;
    private String toLocation;
    private String fromStatus;
    private String toStatus;
    private String targetParticipantGuid;
    private String action;
    private String role;
    private List<EntryAttachment> attachments;
    private String id;
    private ConversationEntryPayloadType type;
    private ConversationEntryConsentStatus status;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<EntryAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<EntryAttachment> attachments) {
        this.attachments = attachments;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
    }

    public String getToStatus() {
        return toStatus;
    }

    public void setToStatus(String toStatus) {
        this.toStatus = toStatus;
    }

    public String getTargetParticipantGuid() {
        return targetParticipantGuid;
    }

    public void setTargetParticipantGuid(String targetParticipantGuid) {
        this.targetParticipantGuid = targetParticipantGuid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConversationEntryPayloadType getType() {
        return type;
    }

    public void setType(String type) {
        this.type = ConversationEntryPayloadType.valueOf(type);
    }

    public ConversationEntryConsentStatus getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = ConversationEntryConsentStatus.valueOf(status);
    }

    public void setStatus(ConversationEntryConsentStatus status) {
        this.status = status;
    }
}
