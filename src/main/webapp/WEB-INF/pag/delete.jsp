<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<body data-type="index" class="theme-white">
	<div class="am-g tpl-g">
		<!-- 头部 -->
		<jsp:include page="common/head.jsp"></jsp:include>
		<!-- 风格切换 -->

		<!-- 侧边导航栏 -->
		<jsp:include page="common/left.jsp"></jsp:include>
		<!-- 内容区域 -->
		<div class="tpl-content-wrapper">

			<div class="row-content am-cf">
				<div class="row  am-cf">

					<div class="row">

						<div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
							<div class="widget am-cf">
								<div class="widget-head am-cf">
									<div class="widget-title am-fl">销户操作</div>
									<div class="widget-function am-fr">
										<a href="javascript:;" class="am-icon-cog"></a>
									</div>
								</div>
								<div class="widget-body am-fr">

									<form class="am-form tpl-form-line-form">


										<div class="am-form-group">
											<label for="user-phone" class="am-u-sm-3 am-form-label">银行卡
												<span class="tpl-form-line-small-title"></span>
											</label>
											<div class="am-u-sm-9">
												<select data-am-selected="{searchBox: 1}"
													style="display: none;" id="cardNum">
													<option value="no">请选择银行卡</option>
													<option value="b">622***009</option>
													<option value="o">622***007</option>
												</select>

											</div>
										</div>
										

										<div class="am-form-group">
											<label for="user-name" class="am-u-sm-3 am-form-label">密码
												<span class="tpl-form-line-small-title"></span>
											</label>
											<div class="am-u-sm-9">
												<input type="password" class="tpl-form-input" id="password"
													placeholder="请输入银行卡密码"> <small></small>
											</div>
										</div>





										<div class="am-form-group">
											<div class="am-u-sm-9 am-u-sm-push-3">
												<button type="button"
													class="am-btn am-btn-primary tpl-btn-bg-color-success " onclick="cancel();">销户</button>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>





				</div>




			</div>



		</div>
	</div>

		<div class="am-modal am-modal-alert" tabindex="-1" id="my-alert">
		  <div class="am-modal-dialog">
		    <div class="am-modal-hd"></div>
		    <div class="am-modal-bd" id="successAlet">
		      	销户成功
		    </div>
		    <div class="am-modal-footer">
		      <span class="am-modal-btn">确定</span>
		    </div>
		  </div>
		</div>
        
        <div class="am-modal am-modal-no-btn" tabindex="-1" id="your-modal">
		  <div class="am-modal-dialog">
		    <div class="am-modal-hd">
		      <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
		    </div>
		    <div class="am-modal-bd" id="errorAlert">
		      	操作失败
		    </div>
		  </div>
		</div>
	
	<jsp:include page="common/foot.jsp"></jsp:include>
	
	<script type="text/javascript">
	
	function loadBankCard() {
		$.post('/card/flow.do',{},deleteback);
	}

	function deleteback(ajaxDAO,status){
		var msg = '<option value="no">请选择银行卡</option>';
		var result = ajaxDAO.data;
		if(ajaxDAO.success){
			for (var i = 0; i < result.length; i++) {
				msg += '<option value="'+result[i].number+'">'+result[i].number+'</option>';
			}

			$('select').html(msg);
		}
		else{
			$('#errorAlert').html(data.message);
    		$('#your-modal').modal('toggle');
			}
		}
	
	
	function cancel() {
		var param={
				number:$('#cardNum').val(),
    			password:$('#password').val()
		};
		$.post('/card/delete.do',param,delback);
	}
	
	function delback(ajaxDAO,status){
		alert("点击");
		if(ajaxDAO.success){
			$('#my-alert').modal('toggle');
		}
		else{
			$('#errorAlert').html(ajaxDAO.message);
    		$('#your-modal').modal('toggle');
			}
		}
	
	$(document).ready(function() {
		$('ul li a').removeClass('active');
		$('#depositHref').addClass("active");
		
		loadBankCard();
		$('#my-alert').on('close.modal.amui', function() {
			window.location.href="/card/toUsercenter.do";
		});
	});
	

	</script>
	
	</body>

	</html>