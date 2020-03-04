package com.bawei.hujintao.model.entity;

import java.util.List;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:实体类
 */
public class HomeEntity {

    /**
     * result : {"rxxp":{"commodityList":[{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/5/1.jpg","price":278,"saleNum":710},{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/6/1.jpg","price":139,"saleNum":864},{"commodityId":17,"commodityName":"化妆镜","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31,"saleNum":555}],"id":1002,"name":"热销新品"},"pzsh":{"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":441},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9,"saleNum":171},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":431},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":1108}],"id":1004,"name":"品质生活"},"mlss":{"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":812},{"commodityId":24,"commodityName":"百搭小白鞋 女款 时尚舒适板鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/7/1.jpg","price":149,"saleNum":629}],"id":1003,"name":"魔力时尚"}}
     * message : 查询成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        /**
         * rxxp : {"commodityList":[{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/5/1.jpg","price":278,"saleNum":710},{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/6/1.jpg","price":139,"saleNum":864},{"commodityId":17,"commodityName":"化妆镜","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31,"saleNum":555}],"id":1002,"name":"热销新品"}
         * pzsh : {"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":441},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9,"saleNum":171},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":431},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":1108}],"id":1004,"name":"品质生活"}
         * mlss : {"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":812},{"commodityId":24,"commodityName":"百搭小白鞋 女款 时尚舒适板鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/7/1.jpg","price":149,"saleNum":629}],"id":1003,"name":"魔力时尚"}
         */

        private RxxpBean rxxp;
        private PzshBean pzsh;
        private MlssBean mlss;

        public RxxpBean getRxxp() {
            return rxxp;
        }

        public void setRxxp(RxxpBean rxxp) {
            this.rxxp = rxxp;
        }

        public PzshBean getPzsh() {
            return pzsh;
        }

        public void setPzsh(PzshBean pzsh) {
            this.pzsh = pzsh;
        }

        public MlssBean getMlss() {
            return mlss;
        }

        public void setMlss(MlssBean mlss) {
            this.mlss = mlss;
        }

        public static class RxxpBean {
            /**
             * commodityList : [{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/ddx/5/1.jpg","price":278,"saleNum":710},{"commodityId":23,"commodityName":"小白鞋 女款 时尚百搭休闲板鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/6/1.jpg","price":139,"saleNum":864},{"commodityId":17,"commodityName":"化妆镜","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31,"saleNum":555}]
             * id : 1002
             * name : 热销新品
             */

            private int id;
            private String name;
            private List<CommodityListBean> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBean> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBean> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBean {
                /**
                 * commodityId : 29
                 * commodityName : 秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲
                 * masterPic : http://mobile.bwstudent.com/images/small/commodity/nx/ddx/5/1.jpg
                 * price : 278
                 * saleNum : 710
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class PzshBean {
            /**
             * commodityList : [{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":441},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9,"saleNum":171},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":431},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","masterPic":"http://mobile.bwstudent.com/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6,"saleNum":1108}]
             * id : 1004
             * name : 品质生活
             */

            private int id;
            private String name;
            private List<CommodityListBeanX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanX {
                /**
                 * commodityId : 6
                 * commodityName : 轻柔系自然裸妆假睫毛
                 * masterPic : http://mobile.bwstudent.com/images/small/commodity/mzhf/cz/4/1.jpg
                 * price : 39
                 * saleNum : 441
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class MlssBean {
            /**
             * commodityList : [{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":812},{"commodityId":24,"commodityName":"百搭小白鞋 女款 时尚舒适板鞋","masterPic":"http://mobile.bwstudent.com/images/small/commodity/nx/bx/7/1.jpg","price":149,"saleNum":629}]
             * id : 1003
             * name : 魔力时尚
             */

            private int id;
            private String name;
            private List<CommodityListBeanXX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanXX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanXX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanXX {
                /**
                 * commodityId : 32
                 * commodityName : 唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋
                 * masterPic : http://mobile.bwstudent.com/images/small/commodity/nx/fbx/1/1.jpg
                 * price : 88
                 * saleNum : 812
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }
    }
}
