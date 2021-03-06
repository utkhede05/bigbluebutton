package org.bigbluebutton.presentation.messages;

public class DocPageGeneratedProgress implements IDocConversionMsg {
  public final String meetingId;
  public final String presId;
  public final String presInstance;
  public final String filename;
  public final String uploaderId;
  public final String authzToken;
  public final Boolean downloadable;
  public final String key;
  public final Integer numPages;
  public final Integer pagesCompleted;

  public DocPageGeneratedProgress(String meetingId, String presId, String presInstance,
                                  String filename, String uploaderId, String authzToken,
                                  Boolean downloadable, String key,
                                  Integer numPages, Integer pagesCompleted) {
    this.meetingId = meetingId;
    this.presId = presId;
    this.presInstance = presInstance;
    this.filename = filename;
    this.uploaderId = uploaderId;
    this.authzToken = authzToken;
    this.downloadable = downloadable;
    this.key = key;
    this.numPages = numPages;
    this.pagesCompleted = pagesCompleted;
  }
}
