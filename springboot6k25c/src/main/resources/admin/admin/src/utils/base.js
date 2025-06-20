const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot6k25c/",
            name: "springboot6k25c",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot6k25c/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "失踪人员信息发布与管理系统"
        } 
    }
}
export default base
