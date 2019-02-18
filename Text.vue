<template>
  <div class="cssui-activity-card">
    <div class="cssui-activity-card__head">
      <div class="media media--namecard">
        <div class="media-left">
          <div class="cssui-avatar cssui-avatar--s">
            <router-link :to="_link" class="cssui-avatar__logo-wrap">
              <popup-logo :owner="content.username" :id="content.userid" size="34"></popup-logo>
            </router-link>
            <span class="cssui-avatar__comp-pos">
              <company-logo :id="content.company_id" size="16"></company-logo>
            </span>
          </div>
        </div>

        <div class="media-body">
          <div class="cssui-namecard cssui-namecard--activity">
            <p class="cssui-namecard__text">
              <router-link :to="_link" class="cssui-namecard__darkgray">
                {{ content.username }}
              </router-link>
              <span v-html="title"></span>
            </p>
          </div>
        </div>

        <div class="media-right">
          <div class="cssui-namecard-right">
            <div class="cssui-action">
              <div class="cssui-action__item icon-30">
                <button
                  v-waves.button
                  type="button"
                  class="base-icon-btn global-icon-heart">
                  <span class="cicon cicon-heart"></span>
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="cssui-activity-card__content">
      <text-cont></text-cont>
    </div>

    <div class="cssui-activity-card__foot">
      <p>{{ changeTime(content.create) }}</p>
    </div>
  </div>
</template>

<script type="text/babel">
import moment from 'moment';
import { mapGetters } from 'vuex';
import likeMixin from 'src/mod/sns/likeMixin';

/**
 * ----------------------------------------------------------------------------------
 *  Text 类型的组件
 * ----------------------------------------------------------------------------------
 *
 * @author zhangmao
 * @change 2016/11/15
 *
 * @change yujie 17/8/21
 */
export default {
  name: 'vm-request-activity-text',

  mixins: [likeMixin],

  props: {
    obj: { type: Object, default() { return {}; } }
  },

  data()
  {
    return {
      content: this.lodash.assign({}, this.obj)
    };
  },

  computed: {
    ...mapGetters(['Request_Get_CurRequest']),

    title() { return this._getTitle(); },
    requestId() { return this.Request_Get_CurRequest.id; },
    _link() { return { name: 'profile', params: { userid: this.content.userid } }; },
  },

  methods: {

    // ------------------------------------------------------------------------------

    // like @TODO 这里需要等待API
    like()
    {
      // this.like(this.content, '');
    },

    // ----------------------------------------------------------------------------------

    // unix时间戳改为什么之前：In 4 minutes
    changeTime(unixTime) { return moment.unix(unixTime).fromNow(); },

    // ------------------------------------------------------------------------------

    // computed title
    _getTitle()
    {
      const action = this.content.action;

      let mess;

      switch (action)
      {
        case 'comment':
          mess = 'commented on';
          break;
        default:
          mess = '';
      }
      return mess;
    }

    // ------------------------------------------------------------------------------

  },

  components: {
    TextCont: () => import('src/vm/request/oldActivity/TextCont.vue'),
  }
};
</script>
