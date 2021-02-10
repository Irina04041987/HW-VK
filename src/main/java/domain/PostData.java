package domain;

public class PostData {
    private int postID;
    private int AuthorID;
    private int ownerID;
    private int postTime;
    private String text;
    private int replyOwnerID;
    private int replyPostID;

    private String imageURL;
    private String postType;

    private CommentsService commentsService;
    private LikesService likesService;
    private ViewsService viesService;
    private GeoService geoService;
    private RepostsService repostsService;
    int signedID;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavourite;

    public CommentsService getCommentsService() {
        return commentsService;
    }

    public void setCommentsService(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    public LikesService getLikesService() {
        return likesService;
    }

    public void setLikesService(LikesService likesService) {
        this.likesService = likesService;
    }

    public ViewsService getViesService() {
        return viesService;
    }

    public void setViesService(ViewsService viesService) {
        this.viesService = viesService;
    }

    public GeoService getGeoService() {
        return geoService;
    }

    public void setGeoService(GeoService geoService) {
        this.geoService = geoService;
    }

    public RepostsService getRepostsService() {
        return repostsService;
    }

    public void setRepostsService(RepostsService repostsService) {
        this.repostsService = repostsService;
    }

    public int getSignedID() {
        return signedID;
    }

    public void setSignedID(int signedID) {
        this.signedID = signedID;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getPostTime() {
        return postTime;
    }

    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerID() {
        return replyOwnerID;
    }

    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public int getReplyPostID() {
        return replyPostID;
    }

    public void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
}
