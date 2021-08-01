package domain;

public class Post {
    private int Id;
    private int ownerId;
    private int fromId;
    private String logoUrl;
    private int date;
    private String text;
    private String imageUrl; /// !!!
    private Copyright copyright; //источник материала
    private CommentsInfo commentsInfo;
    private ViewsInfo viewsInfo;
    private Like like;
    private Repost repost;
    private Geo geo;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds; // информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite; // true, если объект добавлен в закладки у текущего пользователя
    private Donut donut; // информация о записи VK Donut (фин.поддержка проекта)
    private  int postponedId; //
}
