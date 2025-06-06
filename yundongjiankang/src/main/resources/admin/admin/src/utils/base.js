const base = {
    get() {
        return {
            url : "http://localhost:8080/yundongjiankang/",
            name: "yundongjiankang",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yundongjiankang/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "运动健康小程序"
        } 
    }
}
export default base
