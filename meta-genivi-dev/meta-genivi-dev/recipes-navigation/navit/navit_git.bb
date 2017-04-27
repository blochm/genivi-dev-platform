require navit.inc

S = "${WORKDIR}/git"

SRC_URI += "git://github.com/navit-gps/navit.git;branch=trunk;protocol=http \
            file://search_list_get_unique.diff \
            file://0001-add-wayland-ilm-support-navit.patch \
            file://0002-add-precision-opengl-ilm-support-navit.patch \
            file://fsa_issue_padding.diff \
            file://avoid-crash-on-guidance-when-delete-and-recreate-route.diff \
"

SRCREV = "3f26accd04c0f9733f2c8bf7bf58235e2d47a734"
