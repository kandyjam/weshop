package tech.wetech.weshop.vo;


import tech.wetech.weshop.domain.User;

/**
 * @author cjbi
 */
public class UserVO {

    private Integer id;

    private String username;

    private String password;

    private Boolean gender;

    private Integer birthday;

    private Integer registerTime;

    private Integer lastLoginTime;

    private String lastLoginIp;

    private Byte userLevelId;

    private String nickname;

    private String mobile;

    private String registerIp;

    private String avatar;

    private String wechatOpenId;

    public UserVO() {
    }

    public UserVO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.gender = user.getGender();
        this.birthday = user.getBirthday();
        this.registerTime = user.getRegisterTime();
        this.lastLoginTime = user.getLastLoginTime();
        this.lastLoginIp = user.getLastLoginIp();
        this.userLevelId = user.getUserLevelId();
        this.nickname = user.getNickname();
        this.mobile = user.getMobile();
        this.registerIp = user.getRegisterIp();
        this.avatar = user.getAvatar();
        this.wechatOpenId = user.getWechatOpenId();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return gender
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * @return birthday
     */
    public Integer getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    /**
     * @return register_time
     */
    public Integer getRegisterTime() {
        return registerTime;
    }

    /**
     * @param registerTime
     */
    public void setRegisterTime(Integer registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * @return last_login_time
     */
    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     */
    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return last_login_ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * @param lastLoginIp
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * @return user_level_id
     */
    public Byte getUserLevelId() {
        return userLevelId;
    }

    /**
     * @param userLevelId
     */
    public void setUserLevelId(Byte userLevelId) {
        this.userLevelId = userLevelId;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return register_ip
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * @param registerIp
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWechatOpenId() {
        return wechatOpenId;
    }

    public void setWechatOpenId(String wechatOpenId) {
        this.wechatOpenId = wechatOpenId;
    }
}