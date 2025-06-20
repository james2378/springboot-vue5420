<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 144rpx 0","position":"relative","background":"url(http://codegen.caihongy.cn/20221018/6b04e4b2331b4f3d85b1103feff37414.jpg)","height":"100vh"}'>
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}'>
			<view :style='{"padding":"4rpx 16rpx","margin":"0 0 8rpx 0","borderColor":"#e8e8e8","alignItems":"center","borderRadius":"16rpx","borderWidth":"0 0 2rpx 0","background":"-webkit-linear-gradient(top,#eee,#fff)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
				<xia-editor :style='{"border":"0","minHeight":"240rpx","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' v-model="content" @editorChange="contentChange" placeholder="回复"></xia-editor>
			</view>
			<view :style='{"width":"100%","justifyContent":"center","display":"flex","height":"auto"}'>
				<button :style='{"border":"2rpx solid #ffaa33","padding":"0px","boxShadow":"2rpx 4rpx 8rpx #a86b15,inset 0px 0px 112rpx 0px #ffaa33","margin":"32rpx 0 0 0","color":"rgb(255, 255, 255)","borderRadius":"16rpx","background":"#ffe6c3","width":"30%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onReplyTap" class="bg-red margin-tb-sm">提交回复</button>
			</view>
		</form>
	</view>
</view>
</template>

<script>
    import xiaEditor from '@/components/xia-editor/xia-editor'
	export default {
		data() {
			return {
				pid: '',
				content: '',
				username: '',
                avatarurl: '',
				user: {},
			}
		},
        components: {
            xiaEditor
        },
		async onLoad(options) {
			this.pid = options.pid;
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
            if(table == `yonghu`){
                this.username = this.user.yonghuzhanghao
            }
		},
		methods: {
            contentChange(e) {
                this.content = e
            },
			async onReplyTap() {
                this.avatarurl = uni.getStorageSync('headportrait')?uni.getStorageSync('headportrait'):'';
                var sensitiveWords = "";
                var sensitiveWordsArr = [];
                if(sensitiveWords) {
                    sensitiveWordsArr = sensitiveWords.split(",");
                }
                for(var i=0; i<sensitiveWordsArr.length; i++){
                    //全局替换
                    var reg = new RegExp(sensitiveWordsArr[i],"g");
                    //判断内容中是否包括敏感词
                    if (this.content.indexOf(sensitiveWordsArr[i]) > -1) {
                        // 将敏感词替换为 **
                        this.content = this.content.replace(reg,"**");
                    }
                }
				await this.$api.save('forum',{
					parentid: this.pid,
					content: this.content,
                    avatarurl: this.avatarurl,
					username: this.username
				});
				this.$utils.msgBack('回复成功');
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
