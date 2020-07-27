package cn.gl.day11.object;

public class Teacher {
    //属性
    String name;
    int age;
    char gender;
    String nu;//学号

    //java自动提示重写equals方法
    @Override
    public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Teacher teacher = (Teacher) o;

            if (age != teacher.age) return false;
            if (gender != teacher.gender) return false;
            if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;
        return nu != null ? nu.equals(teacher.nu) : teacher.nu == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (int) gender;
        result = 31 * result + (nu != null ? nu.hashCode() : 0);
        return result;
    }


    /*//手动重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return  true;
        }
        if(obj==null){
            return  false;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        Teacher t=(Teacher) obj;
        if(this.age!=t.age){
            return false;
        }
        if(this.gender!=t.gender){
            return false;
        }
        //结果取反用于把name不相等的情况都排除掉
        if(!(this.name==t.name||this.name!=null&&this.name.equals(t.name))){
            return false;//表面就是name不相等返回false
        }
        //前后两个对象的name已经相等，再判断nu
        if(this.nu==t.nu||this.nu!=null&&this.nu.equals(t.nu)){
            return true;
        }
        //前后两个对象的那么已经相等但是nu不相等
        return false;
    }*/
}
