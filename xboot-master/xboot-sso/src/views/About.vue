<template>
  <div class="about">
    <img alt="Vue logo" src="../assets/logo.png" />
    <h1>欢迎来到XBoot前后端分离开发平台单点登录测试站点</h1>
    <h1>sso.exrick.cn</h1>
    <h3>
      XBoot是一个前后端分离快速开发平台，
      <br />详情点击查看
      <a href="http://xb.exrick.cn" target="_blank">XBoot宣传官网</a>
    </h3>
    <div class="footer">
      <h3>本站源码获取</h3>
      <span>本站源码可通过XBoot完整版获取</span>
      <a href="http://xpay.exrick.cn/pay?xboot" target="_blank">
        <Button type="error" style="margin-top:10px;">立即获取完整版</Button>
      </a>
      <h3>
        By:
        <a href="http://exrick.cn" target="_blank">Exrick</a>
      </h3>
    </div>
  </div>
</template>
<style lang="less">
.about {
  h3 {
    margin: 40px 0 0;
  }
  .footer {
    display: flex;
    flex-direction: column;
    width: 100%;
    justify-content: center;
    position: fixed;
    bottom: 50px;
  }
}
</style>
