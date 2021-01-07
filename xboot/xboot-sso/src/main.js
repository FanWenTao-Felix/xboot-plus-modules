import Vue from 'vue'
import App from './App.vue'
import router from './router'
import iView from 'iview'
import 'iview/dist/styles/iview.css'
import { VueSpinners } from '@saeris/vue-spinners'
import { getRequest, getRequestWithNoToken, postRequest, putRequest, deleteRequest, importRequest, uploadFileRequest } from '@/libs/axios'
import { setStore, getStore, removeStore } from '@/libs/storage'
import '@babel/polyfill'

Vue.config.productionTip = false

Vue.use(iView);
Vue.use(VueSpinners);

// 挂载全局使用的方法
Vue.prototype.getRequest = getRequest;
Vue.prototype.getRequestWithNoToken = getRequestWithNoToken;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.prototype.importRequest = importRequest;
Vue.prototype.uploadFileRequest = uploadFileRequest;
Vue.prototype.setStore = setStore;
Vue.prototype.getStore = getStore;
Vue.prototype.removeStore = removeStore;

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
