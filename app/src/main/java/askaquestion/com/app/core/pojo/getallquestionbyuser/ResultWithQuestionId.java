package askaquestion.com.app.core.pojo.getallquestionbyuser;

public class ResultWithQuestionId {
    int user_id;
    int question_id;
    String category_id;
    String country;
    String gender;
    String description;
    String question_compress;
    String question_original;
    String question_thumbnail;
    String option1;
    String option2;
    String option1_compress_image;
    String option1_original_image;
    String option1_thumbnail_image;
    String option2_compress_image;
    String option2_original_image;
    String option2_thumbnail_image;
    int option_type;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuestion_compress() {
        return question_compress;
    }

    public void setQuestion_compress(String question_compress) {
        this.question_compress = question_compress;
    }

    public String getQuestion_original() {
        return question_original;
    }

    public void setQuestion_original(String question_original) {
        this.question_original = question_original;
    }

    public String getQuestion_thumbnail() {
        return question_thumbnail;
    }

    public void setQuestion_thumbnail(String question_thumbnail) {
        this.question_thumbnail = question_thumbnail;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption1_compress_image() {
        return option1_compress_image;
    }

    public void setOption1_compress_image(String option1_compress_image) {
        this.option1_compress_image = option1_compress_image;
    }

    public String getOption1_original_image() {
        return option1_original_image;
    }

    public void setOption1_original_image(String option1_original_image) {
        this.option1_original_image = option1_original_image;
    }

    public String getOption1_thumbnail_image() {
        return option1_thumbnail_image;
    }

    public void setOption1_thumbnail_image(String option1_thumbnail_image) {
        this.option1_thumbnail_image = option1_thumbnail_image;
    }

    public String getOption2_compress_image() {
        return option2_compress_image;
    }

    public void setOption2_compress_image(String option2_compress_image) {
        this.option2_compress_image = option2_compress_image;
    }

    public String getOption2_original_image() {
        return option2_original_image;
    }

    public void setOption2_original_image(String option2_original_image) {
        this.option2_original_image = option2_original_image;
    }

    public String getOption2_thumbnail_image() {
        return option2_thumbnail_image;
    }

    public void setOption2_thumbnail_image(String option2_thumbnail_image) {
        this.option2_thumbnail_image = option2_thumbnail_image;
    }

    public int getOption_type() {
        return option_type;
    }

    public void setOption_type(int option_type) {
        this.option_type = option_type;
    }

    @Override
    public String toString() {
        return "ResultWithQuestionId{" +
                "user_id=" + user_id +
                ", question_id=" + question_id +
                ", category_id='" + category_id + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                ", question_compress='" + question_compress + '\'' +
                ", question_original='" + question_original + '\'' +
                ", question_thumbnail='" + question_thumbnail + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option1_compress_image='" + option1_compress_image + '\'' +
                ", option1_original_image='" + option1_original_image + '\'' +
                ", option1_thumbnail_image='" + option1_thumbnail_image + '\'' +
                ", option2_compress_image='" + option2_compress_image + '\'' +
                ", option2_original_image='" + option2_original_image + '\'' +
                ", option2_thumbnail_image='" + option2_thumbnail_image + '\'' +
                ", option_type=" + option_type +
                '}';
    }
}
