// **********************************************//
// 图书编辑 客户端脚本
// 
//
// @author huayu
// @date 2019年05月13日 21:45
// **********************************************//
var vm = new Vue({
  el: '#app',
  mixins: [],
  data: {
    rs : rs
  },
  methods: {
    submit: function() {
      this.$refs.form.submit('book/egBookEdit/doUpdate').then(function(result){
        Artery.message.info('保存成功');
        window.opener.vm.$refs.table_egBook.reloadData();
        window.opener.vm.$refs.egBookWidiow.close();
      }).catch(function(error){
        Artery.message.error(error.message);
      });
    }
  }
});
