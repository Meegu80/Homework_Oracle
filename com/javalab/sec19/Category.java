package chap06_domain_class.src.com.javalab.sec19;

/**
 *  카테고리 클래스
 *  속성(멤버변수) : 카테고리ID, 카테고리명, 카테고리설명
 */

public class Category {
        public int categoryId;  //카테고리Id
        public String name;      // 카테고리명
        public String description;  //카테고리설명

        // 생성자
        public Category() {
        }
        
        // 생성자2
        public Category(int categoryId, String name, String description) {
            this.categoryId = categoryId;
            this.name = name;
            this.description = description;
        }

        // getter, setter 메서드
        public int getCategoryId() {
           return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
        return description;
    }

        public void setDescription(String description) {
        this.description = description;
    }
}



